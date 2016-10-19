# IATA Barcode Parser
# v0.001, 21 March 2015
# Matthew Grasser <@msgrasser>


## Steps

1. Compile the source.

  javac BarcodeTest.java

2. Run the program, supplying an IATA payload as the only argument. 

```
  java BarcodeTest "M1CUSTOMER/VALUED     EABC1234ABCABCCap12616000F12340000106162-4885-c5133196162-4885-^1b2gvqDG+ULxXUts5CTMLtzmhVEpcSwKaRHiH2zI2vEmHnwitaUPB0bk3Ca9UT2+CdH04762L6ZyusA\nKlOwPk3QJtNWod/X2UViagyXdyVltXQOfb1XuEg0am6gvEVchG5ODgGzF9kzuJPg/HC2+qaovQ==\np6U3YcivxJupt875VH92qw=="
M1CUSTOMER/VALUED     EABC1234ABCABCCap12616000F12340000106162-4885-c5133196162-4885-^1b2gvqDG+ULxXUts5CTMLtzmhVEpcSwKaRHiH2zI2vEmHnwitaUPB0bk3Ca9UT2+CdH04762L6ZyusA\nKlOwPk3QJtNWod/X2UViagyXdyVltXQOfb1XuEg0am6gvEVchG5ODgGzF9kzuJPg/HC2+qaovQ==\np6U3YcivxJupt875VH92qw=="
```

3. Enjoy the output!

```
  Format Code: M
  Number of Legs: 1
  Passenger Name: CUSTOMER/VALUED
  E-Ticket Indicator: E
  PNR Code: ABC1234
  From Venue: ABC
  To Venue: ABC
  Carrier Designator: Cap
  Flight Number: 12616
  Date of Flight: 000
  Compartment Code: F
  Seat Number: 1234
  Check-in Sequence Number: 00001
  Passenger Status: 0
  Following Message Size: 61
  Date Issued: 62-4
  Serial Number: 885-c51331
  Security Data Indicator: 9
  Length of Sec. Data: 16
  Type of Sec. Data: 6
  Security Data: 2-4885-^1b2gvqDG+ULxXUts5CTMLtzmhVEpcSwKaRHiH2zI2vEmHnwitaUPB0bk3Ca9UT2+CdH04762L6ZyusA\nKlOwPk3QJtNWod/X2UViagyXdyVltXQOfb1XuEg0am6gvEVchG5ODgGzF9kzuJPg/HC2+qaovQ==\np6U3YcivxJupt875VH92qw==
```
