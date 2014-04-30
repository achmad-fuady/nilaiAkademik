package Pertemuan7;

public class Matakuliah {
	private String idMatkul;
	private String namaMatkul;
	private int sks;
	public Matakuliah(String idMatkul, String namaMatkul, int sks) {
		
		this.idMatkul = idMatkul;
		this.namaMatkul = namaMatkul;
		this.sks = sks;
	}
	public String getIdMatkul() {
		return idMatkul;
	}
	public void setIdMatkul(String idMatkul) {
		this.idMatkul = idMatkul;
	}
	public String getNamaMatkul() {
		return namaMatkul;
	}
	public void setNamaMatkul(String namaMatkul) {
		this.namaMatkul = namaMatkul;
	}
	public int getSks() {
		return sks;
	}
	public void setSks(int sks) {
		this.sks = sks;
	}
	
	public String toString(){
		return idMatkul+"_"+namaMatkul+"_"+sks;
	}
}
