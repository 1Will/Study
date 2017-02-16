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
	// ��������Ա���ĳ�Ա����
	// ��װ��ǰ��������Ա����List
	private List<EmpBean> emps;

	// emps��setter��getter����
	public void setEmps(List<EmpBean> emps) {
		this.emps = emps;
	}

	public List<EmpBean> getEmps() {
		return this.emps;
	}

	public String execute() {
		// ����ActionContextʵ��
		ActionContext ctx = ActionContext.getContext();
		// ��ȡHttpSession�е�user����
		String mgrName = (String) ctx.getSession().get(WebConstant.USER);
		HttpServletRequest request = (HttpServletRequest) ctx.get(org.apache.struts2.StrutsStatics.HTTP_REQUEST);
		//��ȡcheckbox��value��Ա����ID��
		String[] vb = request.getParameterValues("box");
		setEmps(mgr.getEmpsByMgr(mgrName));
		if (vb != null) {
			for (int i = 0; i < vb.length; i++) {
				Integer b = Integer.parseInt(vb[i]);
				for (int j = 0; j < emps.size(); j++) {
					if (b == emps.get(j).getEmpId()) {
						//�Ӻ�̨��ȡԱ��
						Employee employee = mgr.getEmpsByEmp(emps.get(j).getEmpName());
						mgr.delEmp(employee, mgrName);
						//ֻ��ӡһ��"ɾ��Ա���ɹ�"
						if (j == 0) {
							addActionMessage("ɾ��Ա���ɹ�");
						}
					}
				}
			}
		} else {
			addActionMessage("δѡ��Ա����");
		}
		/*
		 * if (vb != null) { for (int j = vb.length - 1; j >= 0; j--) { int b =
		 * Integer.parseInt(vb[j]); Employee
		 * employee=mgr.getEmpsByEmp(emps.get(b).getEmpName());
		 * mgr.delEmp(employee,mgrName); addActionMessage("ɾ��Ա���ɹ�"); } }else {
		 * addActionMessage("δѡ��Ա����"); }
		 */

		return SUCCESS1;
	}
}
