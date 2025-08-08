package shiv;

class Citizen {
private String CitizenId;
private boolean HasVoted;


public Citizen(String citizenId) {
   this.CitizenId = citizenId;
   this.HasVoted = false;
}


public String getCitizenId() {
   return CitizenId;
}

public boolean getHasVoted() {
   return HasVoted;
}

public void castVote() {
   if (!HasVoted) {
       HasVoted = true;
       System.out.println("Vote cast successfully.");
   } else {
       System.out.println("You have already voted.");
   }
}
}

public class vote {

	public static void main(String[] args) {
		 Citizen citizen1 = new Citizen("CITIZEN001");

	        System.out.println("Citizen ID: " + citizen1.getCitizenId());
	        citizen1.castVote(); 
	        citizen1.castVote();  
	    }



}
