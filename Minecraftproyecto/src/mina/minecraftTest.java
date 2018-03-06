package mina;

import static org.junit.Assert.*;

import org.junit.Test;

public class minecraftTest {

	@Test
	public void testTunel() {
		
		
		        String mina = "}}}}{}{}}{}{}{}"; 
		        assertTrue(minecraft.tunel(mina)==5); 
		     
		        mina = "{}{{{{}{}{}}{}{}{}{}"; 
		        assertTrue(minecraft.tunel(mina)==8); 
		         
		        mina = "{{{{{{aasg{}{}{}{}{}{}{}{}{}"; 
		        assertTrue(minecraft.tunel(mina)==9); 
		         
		        mina = ""; 
		        assertTrue(minecraft.tunel(mina)==0); 
		 
		        mina = "{"; 
		        assertTrue(minecraft.tunel(mina)==0); 
		 
		        mina = "diamantes"; 
		        assertTrue(minecraft.tunel(mina)==0); 
		 
		        mina = "<<<<<<<<<<<<<<<<<<"; 
		        assertTrue(minecraft.tunel(mina)==0); 
		 
		        mina = "////(()"; 
		        assertTrue(minecraft.tunel(mina)==0); 
		 
		    } 
		 
		
	}


