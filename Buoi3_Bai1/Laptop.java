package MayTinh;

public class Laptop {
	private Hang hang;
	private CPU cpu;
	private RAM ram;
	private Mainboard mainboard;
	private int soluong;
	/**
	 * @param hang
	 * @param cpu
	 * @param ram
	 * @param mainboard
	 */
	public Laptop(Hang hang, CPU cpu, RAM ram, Mainboard mainboard, int soluong) {
		super();
		this.hang = hang;
		this.cpu = cpu;
		this.ram = ram;
		this.mainboard = mainboard;
		this.soluong = soluong;
	}
	public Hang getHang() {
		return hang;
	}
	public CPU getCpu() {
		return cpu;
	}
	public RAM getRam() {
		return ram;
	}
	public Mainboard getMainboard() {
		return mainboard;
	}
	public int getSL() {
		return soluong;
	}
	

}
