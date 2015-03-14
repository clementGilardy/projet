package tiers.DAO;

import java.util.ArrayList;
import java.util.Collection;

import tiers.bean.Genre;
import tiers.bean.Personne;


public class DaoImpl implements IDao {

	private ArrayList<Personne> personnes = new ArrayList<Personne>();
	private Integer idCourant = 0;
	
	public void init()
	{
		Personne p1 = new Personne("Gilardy", "Clément", Genre.HOMME, 1991);
		Personne p2 = new Personne("HERVE", "Nicolas", Genre.HOMME, 1989);
		Personne p3 = new Personne("Gilardy", "Gwen", Genre.FEMININ, 1990);
		Personne p4 = new Personne("test", "test", Genre.HOMME, 1991);
		saveOne(p1);
		saveOne(p2);
		saveOne(p3);
		saveOne(p4);
	}
	
	public Integer idSuivant()
	{
		idCourant++;
		return idCourant;
	}
	
	@Override
	public Collection<Personne> getAll() {

		return this.personnes;
	}

	@Override
	public Personne getOne(Integer id) {
		Personne personne = null;
		for(Personne p : personnes)
		{
			if(p.getId().equals(id))
			{
				personne = p;
				break;
			}
		}
		return personne;
	}

	@Override
	public void saveOne(Personne p) {
		
		if(p != null)
		{
			p.setId(this.idSuivant());
			personnes.add(p);
		}
		
	}

	@Override
	public void deleteOne(Integer id) {
		Personne persoDelete = null;
		for(Personne p : personnes)
		{
			if (p.getId().equals(id))
			{
				persoDelete = p;
				break;
			}
		}
		
		if(persoDelete != null)
		{
			personnes.remove(persoDelete);
		}
	}

}
