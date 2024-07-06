package com.neoteric.movieticket;

import org.junit.jupiter.api.Test;

public class MovieTicketTest {



    @Test

    public void test(){


        MovieTicket customer1=new MovieTicket();


        customer1.FullName="sanjay";
        customer1.EmailId="sanjay.konda24@gmail.com";
        customer1.PhoneNumber=9988776655l;


        customer1.MovieName="kalki";
        customer1.Date=22-2-2022;
        customer1.Time="6:22Am";
        customer1.NoofTickets=1;


        customer1.SeatNo=22;
        customer1.SeatType="b-row";


        customer1.CardNO=11223344556l;
        customer1.Expiryno="22-2-2022";
        customer1.CVV=122;





    }
}
