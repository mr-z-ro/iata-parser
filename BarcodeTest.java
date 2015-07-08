//package barcode;

public class BarcodeTest
{
	public static void main(String[] args)
	{
		String barcode = args[0];
		System.out.println(barcode);

		String formatCode = barcode.substring(0, 1);
		String numberOfLegs = barcode.substring(1, 2);
		String passengerName = barcode.substring(2, 22);
		String eTicketIndicator = barcode.substring(22, 23);
		String pnrCode = barcode.substring(23, 30);
		String fromVenueCode = barcode.substring(30, 33);
		String toVenueCode = barcode.substring(33, 36);
		String carrierDesignator = barcode.substring(36, 39);
		String flightNumber = barcode.substring(39, 44);
		String dateOfFlight = barcode.substring(44, 47);
		String compartmentCode = barcode.substring(47, 48);
		String seatNumber = barcode.substring(48, 52);
		String checkinSequenceNumber = barcode.substring(52, 57);
		String passengerStatus = barcode.substring(57, 58);
		String fieldSizeOfFollowingMessage = barcode.substring(58, 60);
		String dateIssued = barcode.substring(60, 64);
		String serialNumber = barcode.substring(64, 74);
		String beginningOfSecurityData = barcode.substring(74, 75); // Just a ^
		String typeOfSecurityData = barcode.substring(75, 76);
		String lengthOfSecurityData = barcode.substring(76, 78);
		String securityData = barcode.substring(78);
		
		o("Format Code", formatCode);
		o("Number of Legs", numberOfLegs);
		o("Passenger Name", passengerName);
		o("E-Ticket Indicator", eTicketIndicator);
		o("PNR Code", pnrCode);
		o("From Venue", fromVenueCode);
		o("To Venue", toVenueCode);
		o("Carrier Designator", carrierDesignator);
		o("Flight Number", flightNumber);
		o("Date of Flight", dateOfFlight);
		o("Compartment Code", compartmentCode);
		o("Seat Number", seatNumber);
		o("Check-in Sequence Number", checkinSequenceNumber);
		o("Passenger Status", passengerStatus);
		o("Following Message Size", fieldSizeOfFollowingMessage);
		o("Date Issued", dateIssued);
		o("Serial Number", serialNumber);
		o("Security Data Indicator", beginningOfSecurityData);
		o("Length of Sec. Data", lengthOfSecurityData);
		o("Type of Sec. Data", typeOfSecurityData);
		o("Security Data", securityData);
	}

	private static void o(String key, String value)
	{
		System.out.println(key + ": " + value);
	}
}
