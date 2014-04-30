package Pertemuan7;

import java.util.ArrayList;
import java.util.List;

public class NilaiMain {
	private List<Nilai> listNilai;
	private List<Matakuliah> listMk;
	private List<Mahasiswa> listMhs;
	
	public NilaiMain() {
		this.listNilai = new ArrayList<Nilai>();
		this.listMk = new ArrayList<Matakuliah>();
		this.listMhs = new ArrayList<Mahasiswa>();;
	}
	
	public void initMhs(){
		listMhs.add(new Mahasiswa("113040001", "daus", ""));
		listMhs.add(new Mahasiswa("113040005", "gilang", ""));
	}
	
	public void initMk(){
		listMk.add(new Matakuliah("IF123", "RKPPL", 3));
		listMk.add(new Matakuliah("IF234", "PSBK", 3));
	}
	
	public void initNilai(){
		listNilai.add(new Nilai(listMhs.get(0), listMk.get(0), 3.0));
		listNilai.add(new Nilai(listMhs.get(1), listMk.get(1), 4.0));
		listNilai.add(new Nilai(listMhs.get(0), listMk.get(1), 4.0));
		listNilai.add(new Nilai(listMhs.get(1), listMk.get(0), 3.0));
	}
	
	public void tampilMhs(){
		for (Mahasiswa mhs:listMhs) {
			System.out.println(mhs);
		}
	}
	
	public void tampilMk(){
		for (Matakuliah mk:listMk) {
			System.out.println(mk);
		}
	}
	
	public void tampilNilai(){
		for (Nilai n:listNilai) {
			System.out.println(n);
		}
	}
	
	public static void main(String[] args) {
		NilaiMain nm = new NilaiMain();
		nm.initMhs();
		nm.initMk();
		nm.initNilai();
		System.out.println("======= List Mahasiswa =======");
		nm.tampilMhs();
		System.out.println("======= List Matakuliah =======");
		nm.tampilMk();
		System.out.println("======= List Nilai =======");
		nm.tampilNilai();
		System.out.println("==============");
	}
}
