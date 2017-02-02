package com.estuate.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.estuate.dao.UserDao;
import com.estuate.dao.UserDaoImpl;
import com.estuate.dto.UserDto;
import com.estuate.service.UserService;

//import com.jcg.examples.viewBean.LoginBean;

@Controller
@RequestMapping("/login/")
public class LoginController

{
	// UserDto userDto = new UserDto();
	@Autowired
	UserService userService;

	/*
	 * @RequestMapping("/contactinfo") public String contactinfo() {
	 * 
	 * return "contactinfo"; }
	 */
	/*
	 * @RequestMapping(value="/register",method = RequestMethod.GET) public
	 * String register(Map<String, Object> map){ return "register"; }
	 */
	@RequestMapping(value = "validate",params="action1", method = RequestMethod.GET)
	public String validateUser(@RequestParam("userName")String userName,@RequestParam("passWord")String password, ModelAndView model) {
		//System.out.println("user Name="+userName+"\npassword="+password);
		//System.out.println(userDto);
		  if( userService.validateUser(userName, password)){
			  //System.out.println(userName);
			 // System.out.println(password);
			//  if(!userName.equals("")&&!password.equals("")&&userName.equals("test")&&password.equals("test")){
			  return "redirect:list";
			  //}
		  }else{
			  
			  return"error";
		  }
		//return "error";
		
		
		
		//map.put("userName", userDto.getUserName());
		//String str=(String) map.put("userName", userDto.getUserName());
		//System.out.println(str);
		//map.put("passWord", userDto.getPassWord());
		/*
		 * String userName=userDto.getUserName(); userDto.setUserName(userName);
		 * //System.out.println(userName); boolean b =userDao.login(userDto);
		 * System.out.println(b); //return getAllStudent(); return null;
		 */
		/*if(userDao.login(userName, passWord)){
			return new ModelAndView("list");
		}else{*/
		
		//}
	}

	/*
	 * @Autowired
	 * 
	 * private LoginDeligate loginDeligate;
	 * 
	 * 
	 * 
	 * @RequestMapping(value="/login",method=RequestMethod.GET)
	 * 
	 * public ModelAndView displayLogin(HttpServletRequest request,
	 * HttpServletResponse response)
	 * 
	 * {
	 * 
	 * ModelAndView model = new ModelAndView("login");
	 * 
	 * // LoginBean loginBean = new LoginBean();
	 * 
	 * // model.addObject("loginBean", loginBean);
	 * 
	 * return model;
	 * 
	 * }
	 * 
	 * @RequestMapping(value="/login",method=RequestMethod.POST)
	 * 
	 * // public ModelAndView executeLogin(HttpServletRequest request,
	 * HttpServletResponse response, @ModelAttribute("loginBean")LoginBean
	 * loginBean)
	 * 
	 * {
	 * 
	 * ModelAndView model= null;
	 * 
	 * try
	 * 
	 * {
	 * 
	 * boolean isValidUser = loginDeligate.isValidUser(loginBean.getUsername(),
	 * loginBean.getPassword());
	 * 
	 * if(isValidUser)
	 * 
	 * {
	 * 
	 * System.out.println("User Login Successful");
	 * 
	 * request.setAttribute("loggedInUser", loginBean.getUsername());
	 * 
	 * model = new ModelAndView("welcome");
	 * 
	 * }
	 * 
	 * else
	 * 
	 * {
	 * 
	 * model = new ModelAndView("login");
	 * 
	 * model.addObject("loginBean", loginBean);
	 * 
	 * request.setAttribute("message", "Invalid credentials!!");
	 * 
	 * }
	 * 
	 * 
	 * 
	 * }
	 * 
	 * catch(Exception e)
	 * 
	 * {
	 * 
	 * e.printStackTrace();
	 * 
	 * }
	 * 
	 * 
	 * 
	 * return model;
	 */

	@RequestMapping(value = "validate",params="action2", method = RequestMethod.GET)
	public String register(UserDto userDto, Map<String, Object> map) {
		
			return "register";
	}

	@RequestMapping(value = "addnewuser",params="action1", method = RequestMethod.POST)
	public ModelAndView addNewUser(UserDto userDto, ModelAndView model) {
//Save in DB
//Atfer  login take him to list page
		
	//UserDto user=new UserDto();
	/*user.setFirstName("");
	List<UserDto> userList=new ArrayList<UserDto>();
	userList.add(user);*/
	/*
	
	
	
	    map.put("firstName", userDto.getFirstName());
		map.put("lastName", userDto.getLastName());
		map.put("email", userDto.getEmail());
		map.put("mobileNumber", userDto.getMobileNumber());
		*/
		//model.addObject("", userDto.getFirstName());
		userService.userRegister(userDto);
	 return new ModelAndView("success");
	}
	
	 @RequestMapping("/list")  
	    public ModelAndView viewList(ModelAndView model){ 
	        List<UserDto> list=userService.getList();  
	        
	        System.out.println(list);
	        model.setViewName("list");
	        model.addObject("vlist", list);
	        return model;
	    }  
	 
	 @RequestMapping("selectedlist")  
	    public ModelAndView selectedUserList(@RequestParam("name")String firstName,ModelAndView model){ 
		 
		    System.out.println("firstname ="+firstName);
	        List<UserDto> list=userService.getUserByName(firstName);  
	        
	        /*System.out.println(list);
	        model.setViewName("list");
	        model.addObject("vlist", list);*/
	        model.setViewName("searchResult");
	        model.addObject("vlist", list);
	        
	        System.out.println(list);
	        return model;
	    }  
	 
}
