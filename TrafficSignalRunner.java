public class TrafficSignalRunner {

	enum TrafficSignal {
		RED("STOP"),GREEN("GO"),YELLOW("GO SLOW");

		private String action;

		private String getAction() {
			return this.action;
		}

	 	private TrafficSignal(String action) {
		this.action = action;
		}
	}

	public static void main(String[] args) {
	TrafficSignal[] signals = TrafficSignal.values();
	for (TrafficSignal signal : signals) 
		System.out.println("Traffic Signal="+signal + " Means = "+signal.getAction());

	}
}
