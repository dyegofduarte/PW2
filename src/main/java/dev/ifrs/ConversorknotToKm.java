package dev.ifrs;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/Conversor_knot_to_km/{knot}")
public class ConversorknotToKm 
    {
        @GET
        @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
        @Produces(MediaType.APPLICATION_JSON)

        public double con_km_milha(@FormParam("knot") double knot) 
            {
                No_to_km km = new No_to_km();
                return km.converte_No_to_km(knot);
                    }

                }    

