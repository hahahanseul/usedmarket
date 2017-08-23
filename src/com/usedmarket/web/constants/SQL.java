package com.usedmarket.web.constants;

public class SQL {
	public static final String ITEM_INSERT=String.format("INSERT INTO %s(%s,%s,%s,%s,%s,%s) VALUES (item_seq.nextval,?,?, 'default.jpg',?,SYSDATE)",DB.TABLE_ITEM,DB.SEQ,DB.TITLE,DB.WRITER,DB.PHOTO,DB.CONTENT,DB.REGDATE);
	
	public static final String ITEM_LIST="";
	public static final String ITEM_FINDBYSEQ="";
	public static final String ITEM_FINDBYNAME="";
	public static final String ITEM_COUNT=String.format("SELECT COUNT(*) AS %s FROM %s","count","Item");
	public static final String ITEM_UPDATE="";
	public static final String ITEM_DELETE="";
}
