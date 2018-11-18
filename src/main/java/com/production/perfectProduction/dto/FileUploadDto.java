package com.production.perfectProduction.dto;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public class FileUploadDto {
 String fileName;
 String url;
 MultipartFile file;
public String getFileName() {
	return fileName;
}
public void setFileName(String fileName) {
	this.fileName = fileName;
}
public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}
public MultipartFile getFile() {
	return file;
}
public void setFile(MultipartFile file) {
	this.file = file;
}
 
}
