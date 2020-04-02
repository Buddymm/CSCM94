public class table {

		private String tableID;
		private int numberOfSeats;
		private boolean available;

		public table(String tabelID_, int numberOfSeats_) {
			tableID = tableID_;
			numberOfSeats = numberOfSeats_;
		}

		public String getTableID() {
			return tableID;
		}

		public int getNumberOfSeats() {
			return numberOfSeats;
		}

		public boolean getAvailable() {
			return available;
		}

		public void setAvailable(boolean available) {
			this.available = available;
		}
}