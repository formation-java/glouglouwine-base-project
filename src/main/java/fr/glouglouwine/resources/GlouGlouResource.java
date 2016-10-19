package fr.glouglouwine.resources;

import javax.ws.rs.Path;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.glouglouwine.repository.BottleRepository;

@Path("/glouglou")
public class GlouGlouResource {

	BottleRepository bottleRepository;

	private static Logger logger = LoggerFactory.getLogger(GlouGlouResource.class.getName());

}
