package dev.ifrs;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/Conversor_km_to_mile/{km}")
public class ConversorKmToMile 
    {
        @POST
        @Produces(MediaType.TEXT_PLAIN)

        public double con_km_milha(@PathParam("km") double km)
            {
                Km_to_mile KM = new Km_to_mile();

                //return km;
                return KM.converte_Km_to_mile(km);
                    }

                }            
                