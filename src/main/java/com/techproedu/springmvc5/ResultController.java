package com.techproedu.springmvc5;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ResultController {
	//1.way
//	@RequestMapping("add")
//	public String result(HttpServletRequest reg) {
//
//		int a = Integer.parseInt(reg.getParameter("n1"));//integer.parseInt kullnmamizin sebebi "n1" string olani integerr cevirmek icin
//		int b = Integer.parseInt(reg.getParameter("n2"));
//		
//		String name=reg.getParameter("n3");
//
//		int sum = a + b;
//		int product = a * b;
//		double division = a / b;
//		int subtrac = a - b;
//
//		HttpSession session = reg.getSession();
//
//		session.setAttribute("sumOfNum", sum);
//		session.setAttribute("productOfNumbers", product);
//		session.setAttribute("divisionOfNumbers", division);
//		session.setAttribute("subtractOfNumbers", subtrac);
//		session.setAttribute("nameOfUser", name);
//
//		return "result.jsp";
//
//	}
		//2.way
//	@RequestMapping("add")
//	public String result(@RequestParam("n1") int a, @RequestParam("n2") int b, @RequestParam("n3") String name,
//			HttpSession session) {
//
//		int sum = a + b;
//		int product = a * b;
//		double division = a / b;
//		int subtrac = a - b;
//
//		session.setAttribute("sumOfNum", sum);
//		session.setAttribute("productOfNumbers", product);
//		session.setAttribute("divisionOfNumbers", division);
//		session.setAttribute("subtractOfNumbers", subtrac);
//		session.setAttribute("nameOfUser", name);
//
//		return "result.jsp";
//
//	}
	//3.way
//	@RequestMapping("add")
//	public ModelAndView result(@RequestParam("n1") int a, @RequestParam("n2") int b, @RequestParam("n3") String name) {
//		
//		ModelAndView mv=new ModelAndView();
//		
//		mv.setViewName("result.jsp");
//
//		int sum = a + b;
//		int product = a * b;
//		double division = a / b;
//		int subtrac = a - b;
//
//		mv.addObject("sumOfNum", sum);
//		mv.addObject("productOfNumbers", product);
//		mv.addObject("divisionOfNumbers", division);
//		mv.addObject("subtractOfNumbers", subtrac);
//		mv.addObject("nameOfUser", name);
//
//		return mv ;
//
//	}
	//4.way
//	@RequestMapping("add")
//	public ModelAndView result(@RequestParam("n1") int a, @RequestParam("n2") int b, @RequestParam("n3") String name) {
//		
//		ModelAndView mv=new ModelAndView("result.jsp");
//		
//		
//
//		int sum = a + b;
//		int product = a * b;
//		double division = a / b;
//		int subtrac = a - b;
//
//		mv.addObject("sumOfNum", sum);
//		mv.addObject("productOfNumbers", product);
//		mv.addObject("divisionOfNumbers", division);
//		mv.addObject("subtractOfNumbers", subtrac);
//		mv.addObject("nameOfUser", name);
//
//		return mv ;
//
//	}
	

	//5.way
//	@RequestMapping("add")
//	public String result(@RequestParam("n1") int a, @RequestParam("n2") int b, @RequestParam("n3") String name,Model m) {
//		
//		
//		
//		
//
//		int sum = a + b;
//		int product = a * b;
//		double division = a / b;
//		int subtrac = a - b;
//
//		m.addAttribute("sumOfNum", sum);
//		m.addAttribute("productOfNumbers", product);
//		m.addAttribute("divisionOfNumbers", division);
//		m.addAttribute("subtractOfNumbers", subtrac);
//		m.addAttribute("nameOfUser", name);
//
//		return "result.jsp";
//
//	}
	//5.second way
//	@RequestMapping("add")
//	public String result(@RequestParam("n1") int a, @RequestParam("n2") int b, @RequestParam("n3") String name,Model m) {
//		
//		
//		
//		
//
//		int sum = a + b;
//		int product = a * b;
//		double division = a / b;
//		int subtrac = a - b;
//
//		m.addAttribute("sumOfNum", sum)
//		.addAttribute("productOfNumbers", product)
//		.addAttribute("divisionOfNumbers", division)
//		.addAttribute("subtractOfNumbers", subtrac)
//		.addAttribute("nameOfUser", name);
//
//		return "result.jsp";
//
//	}
	//6.way
//	@RequestMapping("add")
//	public String result(@RequestParam("n1") int a, @RequestParam("n2") int b, @RequestParam("n3") String name,ModelMap mm) {
//		
//		
//		
//		
//
//		int sum = a + b;
//		int product = a * b;
//		double division = a / b;
//		int subtrac = a - b;
//
//		mm.addAttribute("sumOfNum", sum);
//		mm.addAttribute("productOfNumbers", product);
//		mm.addAttribute("divisionOfNumbers", division);
//		mm.addAttribute("subtractOfNumbers", subtrac);
//		mm.addAttribute("nameOfUser", name);
//
//		return "result";
//
//	}


	//.POST METHOD
//	@RequestMapping(value="add",method=RequestMethod.POST)
//	public String result(@RequestParam("n1") int a, @RequestParam("n2") int b, @RequestParam("n3") String name,ModelMap mm) {
//		
//		
//		
//		
//
//		int sum = a + b;
//		int product = a * b;
//		double division = a / b;
//		int subtrac = a - b;
//
//		mm.addAttribute("sumOfNum", sum);
//		mm.addAttribute("productOfNumbers", product);
//		mm.addAttribute("divisionOfNumbers", division);
//		mm.addAttribute("subtractOfNumbers", subtrac);
//		mm.addAttribute("nameOfUser", name);
//		return "result";
//
//		
//	}
	
//	
//	@PostMapping("add")
//	public String result(@RequestParam("n1") int a, @RequestParam("n2") int b, @RequestParam("n3") String name,ModelMap mm) {
//		
//		
//		
//		
//
//		int sum = a + b;
//		int product = a * b;
//		double division = a / b;
//		int subtrac = a - b;
//
//		mm.addAttribute("sumOfNum", sum);
//		mm.addAttribute("productOfNumbers", product);
//		mm.addAttribute("divisionOfNumbers", division);
//		mm.addAttribute("subtractOfNumbers", subtrac);
//		mm.addAttribute("nameOfUser", name);
//		return "result";
//
//		
//	}
	
//	@RequestMapping(value="addStudents",method=RequestMethod.GET)
//	public String addStudents(Model m) {
//		
//		List<String> st=new ArrayList<>();
//		
//		st.add("murat");
//		st.add("ali");
//		st.add("kemal");
//		st.add("iskender");
//		st.add("john");
//		st.add("ayse");
//		
//			m.addAttribute("addedStudent",st);
//		
//		return "result";
//		
//	}
	
	public String addStudent(@RequestParam())
}
	

