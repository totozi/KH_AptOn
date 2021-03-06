package kh.teamproject.apton.calendar.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import kh.teamproject.apton.admin.model.vo.Admin;
import kh.teamproject.apton.calendar.model.service.CalendarServicelmpl;
import kh.teamproject.apton.calendar.model.vo.Calendar;



@Controller
public class CalendarController {

	@Autowired
	private CalendarServicelmpl calendarservice;   
	
//	// 일정 보기 
//	@RequestMapping(value = "calendar", method = RequestMethod.GET)
//	public String calendar() {
//
//		return "calendar/calendar";
//	}


	
	//일정보기
	@RequestMapping(value = "/calendarlist", method = RequestMethod.GET)
	public ModelAndView selectCalendar(ModelAndView mv) {
		String viewPage = "error/commonError"; //기본페이지 에러페이지로 동일하게 설정함
					
		List<Calendar> calendar = null;
		try {
			calendar = calendarservice.getCalendar();
			viewPage= "calendar/calendar";
		} catch (Exception e) {
			viewPage= "error/commonError";
			mv.addObject("msg" , "게시판 오류 발생");
			mv.addObject("url" , "index");
			e.printStackTrace();
		}
		
		
		System.out.println("달력 정보 calendar: -->"+calendar);
		mv.addObject("calendar",calendar);
		mv.setViewName(viewPage);
		return mv;
	}
	// 관리자 일정 보기 	
	@RequestMapping(value = "/admincalendarlist", method = RequestMethod.GET)
	public ModelAndView selectadminCalendar(ModelAndView mv 
			,HttpServletRequest request ,HttpServletResponse response) throws IOException {
		String viewPage = "error/commonError"; //기본페이지 에러페이지로 동일하게 설정함
					
		List<Calendar> calendar = null;
		
		Admin admin = (Admin) request.getSession().getAttribute("admin");
		//관리자로그인 확인 조건문
		if(admin == null) {
		PrintWriter out = response.getWriter();
//		if(member == null) {
			response.setContentType("text/html; charset=UTF-8");
			 
			out.println("<script>alert('관리자 로그인이 필요합니다'); location.href='./login';</script>");
			 
			out.flush();
		}
		try {
			calendar = calendarservice.getCalendar();
			viewPage= "calendar/admin_calendar";
		} catch (Exception e) {
			viewPage= "error/commonError";
			mv.addObject("msg" , "게시판 오류 발생");
			mv.addObject("url" , "index");
			e.printStackTrace();
		}
		
		
		System.out.println("달력 정보 calendar: -->"+calendar);
		mv.addObject("calendar",calendar);
		mv.setViewName(viewPage);
		return mv;
	}
	
	// 일정 등록 팝업창 
	@RequestMapping(value = "calendarpop", method = RequestMethod.GET)
	public String calendar() {

		return "calendar/calendarinsertpop";
	}

		
	@RequestMapping(value = "calendarinsert", method = RequestMethod.POST)
	@ResponseBody
	public String insertcalendar(String msg, HttpServletRequest request) {
		String calendartitle = request.getParameter("calendartitle");
		String adminId = request.getParameter("adminId");
		String startdate = request.getParameter("calendarStartDate");
		String enddate = request.getParameter("calendarenddate");
			


		System.out.println("calendartitle: " + calendartitle);
		System.out.println("adminId= "+ adminId);
		System.out.println("startdate= " + startdate);
		System.out.println("enddate= " + enddate);
		
					

			try {
				Calendar vo = new Calendar(adminId, calendartitle ,startdate,enddate);
				int result = calendarservice.insertCalendar(vo);
				msg = "success";
			} catch (Throwable e) {
				e.printStackTrace();
			}
			return msg;
		}

//	// 일정 상세 팝업창 
//	@RequestMapping(value = "calendar-detail", method = RequestMethod.GET)
//	public String calendardetail() {
//
//		return "calendar/calendardetail";
//	}
	
	
	@RequestMapping(value = "calendar-detail", method = RequestMethod.GET)
	public ModelAndView selectCalendarView(ModelAndView mv, @RequestParam(value="no" , defaultValue = "0")int calendar_num ) {
		String viewPage = "error/commonError"; //기본페이지 에러페이지로 동일하게 설정함
		
		System.out.println("일정 번호: ->"+ calendar_num);
		List<Calendar> calendarlist = null;
		try {
			calendarlist = calendarservice.selectCalendarView(calendar_num);
			viewPage= "calendar/calendardetail";
		} catch (Exception e) {
			viewPage= "error/commonError";
			mv.addObject("msg" , "게시판 오류 발생");
			mv.addObject("url" , "index");
			e.printStackTrace();
		}
		System.out.println("admin_calendardetail: -->"+calendarlist);
		mv.addObject("calendarlist",calendarlist);
		mv.setViewName(viewPage);
		return mv;
	}
	
	//일정 삭제
	@RequestMapping(value = "calendardelete", method = RequestMethod.POST)
	@ResponseBody
	public String deletecalendar(String msg, HttpServletRequest request) {
		int calendarnum = Integer.parseInt(request.getParameter("calendarnum"));

		System.out.println("calendarnum: " + calendarnum);
			try {
				Calendar vo = new Calendar(calendarnum);
				int result = calendarservice.deleteCalendar(calendarnum);
				msg = "success";
			} catch (Throwable e) {
				e.printStackTrace();
			}
			return msg;
		}
	
	//일정 수정
	@RequestMapping(value = "updatecalendar", method = RequestMethod.POST)
	@ResponseBody
	public String updatecalendar(String msg, HttpServletRequest request) {
		int calendarnum = Integer.parseInt(request.getParameter("calendarnum"));
		String calendartitle = request.getParameter("calendartitle");
		String adminId = request.getParameter("adminId");
		String startdate = request.getParameter("calendarStartDate");
		String enddate = request.getParameter("calendarenddate");
			

		System.out.println("calendarnum: " + calendarnum);
		System.out.println("calendartitle: " + calendartitle);
		System.out.println("adminId= "+ adminId);
		System.out.println("startdate= " + startdate);
		System.out.println("enddate= " + enddate);
		
			try {
				Calendar vo = new Calendar(calendarnum,adminId, calendartitle ,startdate,enddate);
				int result = calendarservice.updateCalendar(vo);
				msg = "success";
			} catch (Throwable e) {
				e.printStackTrace();
			}
			return msg;
		}	
}
