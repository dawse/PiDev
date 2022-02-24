package tn.esprit.entities;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



	@Entity
	@Getter
	@Setter
	@AllArgsConstructor
	@NoArgsConstructor
	public class  Reclamation implements Serializable{

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private Long id;
		@Column(name="nom")
		private String nom;
		@Column(name="prenom")
		private String prenom;
		@Column(name="reclam")
		private String reclam;
	
	
		
		
			
		}

	


