package kh.teamproject.apton.calendar.model.dao;


import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kh.teamproject.apton.admin.notice.vo.Notice;
import kh.teamproject.apton.calendar.model.vo.Calendar;

@Repository("calendarDao")
public class CalendarDao {

	@Autowired
	private SqlSession sqlSession;	
	
	public List<Calendar> getCalendar() throws Exception {
		List<Calendar> calendar = null;
		
		
		calendar = sqlSession.selectList("Calendar.calendarlist");
		System.out.println("달력dao: "+ calendar);
		return calendar;
		
	}
	
	public int insertCalendar(Calendar vo) throws Exception{
		System.out.println("dao값: " + vo);
		return sqlSession.insert("Calendar.insertCalendar", vo);
	}
	
	public List<Calendar> selectCalendarView(int calendar_num) throws Exception  {
		System.out.println("dao값: " + calendar_num);
		return sqlSession.selectList("Calendar.selectCalendarView", calendar_num);
	}
	
	public int deleteCalendar(int calendarnum) throws Exception{
		System.out.println("삭제dao값: " + calendarnum);
		return sqlSession.delete("Calendar.deleteCalendar", calendarnum);
	}
	
	public int updateCalendar(Calendar vo) throws Exception{
		System.out.println("수정dao값: " + vo);
		return sqlSession.update("Calendar.updateCalendar", vo);
	}
	
}
