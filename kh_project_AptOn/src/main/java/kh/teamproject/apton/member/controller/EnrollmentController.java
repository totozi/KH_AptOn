package kh.teamproject.apton.member.controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;


import kh.teamproject.apton.admin.model.vo.Admin;
import kh.teamproject.apton.defectreception.model.vo.DrBoard;
import kh.teamproject.apton.defectreception.service.BoardDefectreceptionService;
import kh.teamproject.apton.member.model.service.MemberService;
import kh.teamproject.apton.member.model.vo.Member;

import com.google.cloud.storage.BlobInfo;
import com.google.cloud.storage.Storage;
import com.google.cloud.storage.Storage.BlobTargetOption;
import com.google.cloud.storage.Storage.PredefinedAcl;
import com.google.cloud.storage.StorageOptions;
import com.google.gson.Gson;


@Controller
public class EnrollmentController { 
	
	@Autowired
	private MemberService memberService;
		
	

	
	@RequestMapping(value = "userjoin", method = RequestMethod.GET)
	public ModelAndView selectBoardList(ModelAndView mv) {
		String viewPage = "error/commonError"; //기본페이지 에러페이지로 동일하게 설정함

		viewPage = "/enrollment/user_enrollment";

		mv.setViewName(viewPage);
		return mv;
	}
	
	@RequestMapping(value = "userjoin", method = RequestMethod.POST)
	public ModelAndView selectContentView(ModelAndView mv,
			@RequestParam(value="userHouseNum" , defaultValue = "0")long userHouseNum,
			@RequestParam(value = "userPassword")String userPassword,
			@RequestParam(value = "userName")String userName,
			@RequestParam(value = "phone")String phone,
			HttpServletRequest request,
			HttpServletResponse response) {
		String viewPage = "error/commonError"; //기본페이지 에러페이지로 동일하게 설정함
				
		
		
		Member vo = new Member(userHouseNum, userPassword, userName, phone);
		try {
			int result = memberService.insertMember(vo);
			if (result == 1) {
				response.setContentType("text/html; charset=UTF-8");
				 
				PrintWriter out = response.getWriter();
				 
				out.println("<script>alert('회원가입에 성공하였습니다.'); location.href='./login';</script>");
				 
				out.flush();
			}
			
		} catch (Exception e) {
			viewPage= "error/commonError";
			mv.addObject("msg" , "게시판 오류 발생");
			mv.addObject("url" , "index");
			e.printStackTrace();
		}
		mv.setViewName(viewPage);
		
				
		
		return mv;
	}
	
	@RequestMapping(value = "idchk", method = RequestMethod.POST)
	@ResponseBody
	public int idchk(ModelAndView mv, 
			@RequestParam(value = "userHousenum", required = false)long houseNumParam,
			HttpServletResponse response) {
		int result = 0;

		try {
		
			
			Member vo = new Member(houseNumParam);
			vo = memberService.idChk(houseNumParam);
			
			System.out.println("컨트롤단 결과:"+ vo);
					if (vo == null) {
						System.out.println("사용 가능한 가구번호입니다.");
						result = 1;

						
					}else {
						System.out.println("이미 존재하는 가구번호입니다.");
						result = 0;
					}
					
					

					
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
		
	}
		
	

}
