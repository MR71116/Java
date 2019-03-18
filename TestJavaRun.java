package com.scb.module.collection_cib;

import java.io.IOException;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Locale;

import org.json.simple.JSONObject;

import com.codoid.products.exception.FilloException;
import com.scb.module.collection_cib_Utility.DataProvider;
import com.scb.module.collection_cib_Utility.OrcaleDBConnection_Old;

import io.restassured.path.json.JsonPath;

public class TestJavaRun {

	public static void main(String args[])
	{
		String s = "{\"data\":{\"txnAmt\":1250123432112.2}}";
		//JSONObject jobject = new JSONObject(s);
		Double d = new Double( 1.25012345E+12);
	JsonPath jpath = new JsonPath(s);
	System.out.println(BigDecimal.valueOf(d).doubleValue());
	DecimalFormat formatter = new DecimalFormat("12345678912345L");
	System.out.println(formatter.format(d));
	
	System.out.println(String.format("%.1f", d));
	String s1 = "{\"header\":{\"msgSender\":\"API\",\"msgTimestamp\":\"2019-03-14T13:52:12.420Z\",\"senderId\":\"UAASTST1\",\"custId\":\"692537\",\"batchNbr\":\"01PQUMV\",\"rtInd\":\"Y\",\"sysRefId\":\"DI0080022\",\"trackingId\":\"14c7be5d-dc52-40e3-acd1-22f00eb91e15\",\"ctryCd\":\"HK\"},\"data\":{\"purpCd\":\"DDOTHR\",\"txnCcy\":\"HKD\",\"txnAmt\":1250123432112.2,\"valDt\":\"20190314\",\"txnRef\":\"MAVTST13766834\",\"custRef\":\"MAVTST13766834\",\"endToEndRef\":\"MA0291006\",\"e2EId\":\"DI0080022\",\"addInfo1\":\"MAVTST13766834\",\"addInfo2\":\"MAVTST13766834\",\"dbtrInfo\":{\"dbtrNm\":\"FPS CUST 01F302142\",\"dbtrAcct\":\"20205001432\",\"dbtrAcctTyp\":\"B\"},\"cdtrInfo\":{\"cdtCcy\":\"HKD\",\"cdtrNm\":\"UAASTST1\",\"cdtrAcct\":\"20205002714\",\"cdtrAcctType\":\"B\"},\"orgnBkInfo\":{\"orgnBkCd\":\"003\",\"crdtBkBIC\":\"003\"},\"destBkInfo\":{\"destBkCd\":\"003\",\"dbtrBICCd\":\"003\"}}}";
	
	System.out.println(s1.substring(s1.indexOf("\"txnAmt\"")+9, s1.indexOf(",\"valDt\"")));
	
	System.out.println();
	
	JsonPath jpath1 = new JsonPath(s1);
	//System.out.println(new BigDecimal(jpath.get("data.txnAmt")).toPlainString());
	System.out.println(jpath.getFloat("data.txnAmt"));
		
//	System.out.println(jobject.get("data.txnAmt"));
//	System.out.println(jobject.getDouble("txnAmt"));
//	System.out.println(jobject.getFloat("txnAmt"));
//	System.out.println(jobject.getInt("txnAmt"));
//	System.out.println(jobject.getLong("txnAmt"));
//	//System.out.println(jobject.getString("txnAmt"));
//	System.out.println(jobject.getNumber("txnAmt"));
//	System.out.println(jobject.getBigDecimal("txnAmt").toEngineeringString());
//	System.out.println(jobject.getBigDecimal("txnAmt").toEngineeringString().toString());
//	System.out.println(jobject.getBigDecimal("txnAmt").toPlainString().toString());
	}


}
