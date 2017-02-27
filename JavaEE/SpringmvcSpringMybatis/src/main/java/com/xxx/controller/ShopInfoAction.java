package com.xxx.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xxx.controller.valueobject.ShopInfoVO;
import com.xxx.model.SmiShopInfo;
import com.xxx.service.ISmiShopInfoService;

import net.sf.jsqlparser.statement.update.Update;

/**
 * 影院店铺信息action
 * 
 * @author author
 * @date 2016/02/16
 */
@Controller
public class ShopInfoAction {

	private Logger logger = Logger.getLogger(this.getClass());
	
	@Autowired
	private ISmiShopInfoService smiShopInfoService;
	
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
	//登录
	@RequestMapping(value = "/login.do")
	public @ResponseBody ShopInfoVO login(HttpServletRequest request,HttpServletResponse response,String shopNo,String password) throws Exception {
		
		SmiShopInfo shopInfo = smiShopInfoService.getShopByNoAndPwd(shopNo, password);
		if(null==shopInfo||"".equals(shopInfo)){
			
			logger.warn(shopNo+"：登录失败，用户名或密码错误");
			return null;
		}else{
			ShopInfoVO vo = new ShopInfoVO();
			vo.setId(shopInfo.getId());
			vo.setShopNo(shopInfo.getShopNo());
			vo.setShopName(shopInfo.getShopName());
			vo.setShopPassword("");//密码不传输到页面
			vo.setShopType(shopInfo.getShopType());
			vo.setNote(shopInfo.getNote());
			logger.info(shopInfo.getShopName()+"["+shopNo+"]：登录成功");
			return vo;
		}
	}
	
	//查询所有数据
	@RequestMapping(value = "/viewAll")
	public String viewAll(Model model){
		//从数据库获取对象
		List<SmiShopInfo> shopInfoList = smiShopInfoService.getAllShop();
		//设置到页面对象
		List<ShopInfoVO> voList = new ArrayList<ShopInfoVO>();
		for(int i=0;i<shopInfoList.size();i++){
			ShopInfoVO vo =new ShopInfoVO();
			vo.setId(shopInfoList.get(i).getId());
			vo.setShopNo(shopInfoList.get(i).getShopNo());
			vo.setShopName(shopInfoList.get(i).getShopName());
			vo.setShopPassword(shopInfoList.get(i).getShopPassword());
			vo.setShopType(shopInfoList.get(i).getShopType());
			vo.setNote(shopInfoList.get(i).getNote());
			voList.add(vo);
		}
		model.addAttribute("voList",voList);
		//System.out.println(voList.get(0).getShopName());
		//System.out.println(voList.get(1).getShopName());
		
		
		return "ViewAll";
	}
	
	//修改一个，提交至页面
	@RequestMapping(value = "/update1")
	public String Update(HttpServletRequest request,Model model){
		int id=Integer.parseInt(request.getParameter("id"));
		SmiShopInfo shopInfo = smiShopInfoService.getById(id);
		ShopInfoVO vo = new ShopInfoVO();
		vo.setId(shopInfo.getId());
		vo.setShopNo(shopInfo.getShopNo());
		vo.setShopName(shopInfo.getShopName());
		vo.setShopPassword(shopInfo.getShopPassword());//密码不传输到页面
		vo.setShopType(shopInfo.getShopType());
		vo.setNote(shopInfo.getNote());
		model.addAttribute("vo",vo);
		return "update";
	}
	
	//写入数据库，开始修改
	@RequestMapping(value = "/update2")
	public String UpdateOne(ShopInfoVO vo){
		SmiShopInfo shopInfo = new SmiShopInfo();
		shopInfo.setId(vo.getId());
		shopInfo.setShopNo(vo.getShopNo());
		shopInfo.setShopName(vo.getShopName());
		shopInfo.setShopPassword(vo.getShopPassword());//密码不传输到页面
		shopInfo.setShopType(vo.getShopType());
		shopInfo.setNote(vo.getNote());
		smiShopInfoService.update(shopInfo);
		return "redirect:/viewAll.do";
	}
	
	//根据id删除一个
	@RequestMapping(value = "/delete")
	public String Delete(HttpServletRequest request){
		int id=Integer.parseInt(request.getParameter("id"));
		smiShopInfoService.delete(id);
		return "redirect:/viewAll.do";
	}
}
