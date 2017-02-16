package org.crazyit.hrsystem.vo;

import java.io.Serializable;
/**
 * Description:
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class EmpBean implements Serializable
{
	private static final long serialVersionUID = 48L;
	private Integer empId;
	private String empName;
	private String empPass;
	private double amount;
	private String empSex;
	private int empAge;


	// �޲����Ĺ�����
	public EmpBean()
	{
	}
	// ��ʼ��ȫ����Ա�����Ĺ�����
	public EmpBean(String empName , String empPass , double amount,String empSex ,int empAge,Integer empId)
	{
		this.empName = empName;
		this.empPass = empPass;
		this.amount = amount;
		this.empSex=empSex;
		this.empAge=empAge;
		this.empId=empId;
	}
	
	//empId��setter��getter����
	public void setEmpId(Integer empId)
	{
		this.empId=empId;
	}
	public Integer getEmpId()
	{
		return this.empId;
	}

	// empName��setter��getter����
	public void setEmpName(String empName)
	{
		this.empName = empName;
	}
	public String getEmpName()
	{
		return this.empName;
	}

	// empPass��setter��getter����
	public void setEmpPass(String empPass)
	{
		this.empPass = empPass;
	}
	public String getEmpPass()
	{
		return this.empPass;
	}

	// amount��setter��getter����
	public void setAmount(double amount)
	{
		this.amount = amount;
	}
	public double getAmount()
	{
		return this.amount;
	}
	// empSex��setter��getter����
		public void setEmpSex(String empSex)
		{
			this.empSex = empSex;
		}
		public String getEmpSex()
		{
			return this.empSex;
		}
		
		// empAge��setter��getter����
		public void setEmpAge(int empAge)
		{
			this.empAge = empAge;
		}
		public int getEmpAge()
		{
			return this.empAge;
		}

}