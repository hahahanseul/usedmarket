package com.usedmarket.web.constants;

public class SQL {
	public static final String ITEM_INSERT=String.format("INSERT INTO %s(%s,%s,%s,%s,%s,%s) VALUES (item_seq.nextval,?,?, 'default.jpg',?,SYSDATE)",DB.TABLE_ITEM,DB.SEQ,DB.TITLE,DB.WRITER,DB.PHOTO,DB.CONTENT,DB.REGDATE);
	
	public static final String ITEM_LIST=
	" SELECT t2.* " +
	" FROM(SELECT rownum rnum, t.* " +
	" FROM(SELECT i.* FROM ITEM i ORDER BY rownum desc) t)t2 " +
	" WHERE t2.rnum between ? and ? ";
	public static final String ITEM_FINDBYSEQ="";
	public static final String ITEM_FINDBYNAME="";
	public static final String ITEM_COUNT=String.format("SELECT COUNT(*) AS %s FROM %s","count",DB.TABLE_ITEM);
	public static final String ITEM_UPDATE="";
	public static final String ITEM_DELETE="";
	
	
	
}
