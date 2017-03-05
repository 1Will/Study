package com.xxx.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xxx.controller.valueobject.PersonVo;
import com.xxx.controller.valueobject.ShopInfoVO;
import com.xxx.model.Person;
import com.xxx.model.SmiShopInfo;
import com.xxx.service.ISmiShopInfoService;
import com.xxx.service.PersonService;

/**
 * 影院店铺信息action
 * 
 * @author author
 * @date 2016/02/16
 */
@Controller
public class PersonAction {

	private Logger logger = Logger.getLogger(this.getClass());

	@Autowired
	private PersonService personService;

	/**
	 * 用户登录
	 * 
	 * @ResponseBody 设置该参数，指定response的type为比如json或xml，本文采用json序列化方式传输数据
	 * 
	 * @param request
	 * @param response
	 * @param shopNo
	 * @param password
	 * @return
	 * @throws Exception
	 */

	public PersonVo getPersonVo(Person person){
		PersonVo personVo =new PersonVo(person.getId(),person.getName(), person.getSex());
		return personVo;
	}
	public Person getPerson(PersonVo personVo){
		Person person =new Person(personVo.getId(),personVo.getName(), personVo.getSex());
		return person;
	}

	// 登录

	// 查询所有数据
	@RequestMapping(value = "/viewAllPerson")
	public String viewAllPerson(Model model){
		List<Person> pers= personService.getAll();
		List<PersonVo> perVos=new ArrayList<PersonVo>();
		for(int i=0;i<pers.size();i++){
			perVos.add(getPersonVo(pers.get(i)));
		}
		model.addAttribute("perVos",perVos);
		return "viewAllPerson";
	}
	
	// 修改一个，提交至页面
	@RequestMapping(value = "/updatePerson")
	public String updatePerson(HttpServletRequest request,Model model){
		int id = Integer.parseInt(request.getParameter("id"));
		PersonVo pVo=getPersonVo(personService.getById(id));
		model.addAttribute("pVo",pVo);
		return "updatePerson";
	}
	// 写入数据库，开始修改
	@RequestMapping(value = "/updatePerson2")
	public @ResponseBody Person updatePerson2(Integer id, String name,String sex){
		Person person=new Person(id, name, sex);
		personService.update(person);
		return person;
	}
	//批量修改姓名
	@RequestMapping(value = "/updateName")
	public String updateName(HttpServletRequest request,HttpSession session){
		String ids[]=request.getParameterValues("box");
		session.setAttribute("ids", ids);
		return "updateName";
	}
	@RequestMapping(value = "/updateName2")
	public String updateName2(String name,HttpSession session){
		System.out.println(session.getAttribute("ids"));
		String ids[]= (String[]) session.getAttribute("ids");
		session.removeAttribute("ids");
		for(int i=0;i<ids.length;i++){
			personService.updateName(Integer.parseInt(ids[i]), name);
		}
		return "redirect:/viewAllPerson.do";
	}
	@RequestMapping(value = "/updateSex")
	public String updateSex(HttpServletRequest request,HttpSession session){
		String ids[]=request.getParameterValues("box");
		session.setAttribute("ids", ids);
		return "updateSex";
	}
	@RequestMapping(value = "/updateSex2")
	public String updateSex2(String sex,HttpSession session){
		String ids[]= (String[]) session.getAttribute("ids");
		session.removeAttribute("ids");
		for(int i=0;i<ids.length;i++){
			personService.updateSex(Integer.parseInt(ids[i]), sex);
		}
		return "redirect:/viewAllPerson.do";
	}
	
	
	//批量修改性别

	// 根据id删除一个
	@RequestMapping(value = "/deletePerson")
	public String delete(HttpServletRequest request) {
		int id = Integer.parseInt(request.getParameter("id"));
		personService.delete(id);
		logger.info("已删除id为" + id + "的用户！");
		return "redirect:/viewAllPerson.do";
	}

	@RequestMapping(value = "/insertPerson")
	public String insertPerson() {
		return "insertPerson";
	}

	@RequestMapping(value = "/insertPerson2")
	public @ResponseBody Person insert2( String name,String sex) {
		Person person=new Person(null, name, sex);
		personService.insert(person);
		//return "redirect:/viewAllPerson.do";
		return person;
	}

}
