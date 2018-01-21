package com.it.entity;

public class FounderFile {
	private int fildid;
	private String filename;
	private String filepic;
	private int fileprice;
	private String filedes;

	@Override
	public String toString() {
		return "FounderFile [fildid=" + fildid + ", filename=" + filename
				+ ", filepic=" + filepic + ", fileprice=" + fileprice
				+ ", filedes=" + filedes + "]";
	}

	public int getFildid() {
		return fildid;
	}

	public void setFildid(int fildid) {
		this.fildid = fildid;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getFilepic() {
		return filepic;
	}

	public void setFilepic(String filepic) {
		this.filepic = filepic;
	}

	public int getFileprice() {
		return fileprice;
	}

	public void setFileprice(int fileprice) {
		this.fileprice = fileprice;
	}

	public String getFiledes() {
		return filedes;
	}

	public void setFiledes(String filedes) {
		this.filedes = filedes;
	}

}
