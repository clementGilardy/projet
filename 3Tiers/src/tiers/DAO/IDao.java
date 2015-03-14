package tiers.DAO;

import java.util.Collection;

import tiers.bean.Personne;

public interface IDao {
	
	public Collection<Personne>  getAll();
	public Personne getOne(Integer id);
	public void saveOne(Personne p);
	public void deleteOne(Integer id);

}
