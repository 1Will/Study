package org.crazyit.hrsystem.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.opensymphony.xwork2.*;
import org.apache.struts2.interceptor.*;

import org.crazyit.hrsystem.exception.HrException;
import org.crazyit.hrsystem.vo.EmpBean;
import org.crazyit.hrsystem.domain.*;
import org.crazyit.hrsystem.action.base.MgrBaseAction;

public class DeleteEmpAction extends MgrBaseAction {
	final String SUCCESS1 = "success1";
	// 代表新增员工的成员变量
	// 封装当前经理所有员工的List
	private List<EmpBean> emps;

	// emps的setter和getter方法
	public void setEmps(List<EmpBean> emps) {
		this.emps = emps;
	}

	public List<EmpBean> getEmps() {
		return this.emps;
	}

	public String execute() {
		// 创建ActionContext实例
		ActionContext ctx = ActionContext.getContext();
		// 获取HttpSession中的user属性
		String mgrName = (String) ctx.getSession().get(WebConstant.USER);
		HttpServletRequest request = (HttpServletRequest) ctx.get(org.apache.struts2.StrutsStatics.HTTP_REQUEST);
		//获取checkbox的value（员工的ID）
		String[] vb = request.getParameterValues("box");
		setEmps(mgr.getEmpsByMgr(mgrName));
		if (vb != null) {
			for (int i = 0; i < vb.length; i++) {
				Integer b = Integer.parseInt(vb[i]);
				for (int j = 0; j < emps.size(); j++) {
					if (b == emps.get(j).getEmpId()) {
						//从后台获取员工
						Employee employee = mgr.getEmpsByEmp(emps.get(j).getEmpName());
						mgr.delEmp(employee, mgrName);
						//只打印一句"删除员工成功"
						if (j == 0) {
							addActionMessage("删除员工成功");
						}
					}
				}
			}
		} else {
			addActionMessage("未选择员工！");
		}
		/*
		 * if (vb != null) { for (int j = vb.length - 1; j >= 0; j--) { int b =
		 * Integer.parseInt(vb[j]); Employee
		 * employee=mgr.getEmpsByEmp(emps.get(b).getEmpName());
		 * mgr.delEmp(employee,mgrName); addActionMessage("删除员工成功"); } }else {
		 * addActionMessage("未选择员工！"); }
		 */

		return SUCCESS1;
	}
}
