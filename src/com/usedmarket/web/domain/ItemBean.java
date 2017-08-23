package com.usedmarket.web.domain;

import java.io.Serializable;
import lombok.Data;

@Data
public class ItemBean implements Serializable{
	private static final long serialVersionUID=1L;
	private String itemSeq, title, writer, photo, content, regdate;
}
