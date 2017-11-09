package com.bridgeit;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bridgeit.dao.StudentDao;
import com.bridgeit.model.Student;

@Controller
public class Crud {
	
	@Autowired
 	Student student;
	@Autowired
	StudentDao studentDao;
	
	
	@RequestMapping("/create")
	public ModelAndView create(HttpServletRequest request,HttpServletResponse response) {
	
		student.setName(request.getParameter("name"));
		student.setId(request.getParameter("id"));
		student.setDept(request.getParameter("dept"));
		student.setNumber(request.getParameter("number"));
		int result=studentDao.create();
		ModelAndView modelAndView=new ModelAndView();
		
		if(result>0) {
			modelAndView.setViewName("display.jsp");
			modelAndView.addObject("name",student.getName());
			modelAndView.addObject("id",student.getId());
			modelAndView.addObject("dept",student.getDept());
			modelAndView.addObject("number",student.getNumber());
			return modelAndView;	
		}
		else {
			modelAndView.setViewName("error.jsp");
			modelAndView.addObject("message","error...");
			return modelAndView;
		}
		
		
	}
	
	
	@RequestMapping("/update")
	public ModelAndView update(HttpServletRequest request,HttpServletResponse response) {
		student.setId(request.getParameter("id"));
		student.setName(request.getParameter("name"));
		student.setNumber(request.getParameter("number"));
		
		
		int result=studentDao.update();
		
		
		ModelAndView modelAndView=new ModelAndView();
		if(result>0) {
			modelAndView.setViewName("error.jsp");
			modelAndView.addObject("message","Update Successfully...");
			
			return modelAndView;	
		}
		else {
			modelAndView.setViewName("error.jsp");
			modelAndView.addObject("message","error...");
			return modelAndView;
		}
		
	}
	
	@RequestMapping("/delete")
	public ModelAndView delete(HttpServletRequest request,HttpServletResponse response) {
		student.setId(request.getParameter("id"));
		int result=studentDao.delete();
	
		
		
		ModelAndView modelAndView=new ModelAndView();
		if(result>0) {
			modelAndView.setViewName("error.jsp");
			modelAndView.addObject("message","Deleted Successfully...");
			
			return modelAndView;	
		}
		else {
			modelAndView.setViewName("error.jsp");
			modelAndView.addObject("message","error...");
			return modelAndView;
		}
		
		

	}
	
}
