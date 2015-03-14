package tiers.services;

import java.util.Collection;

import tiers.bean.Personne;

public interface IService {

	public Collection<Personne> getAll();
	public Personne getOne(Integer id);
	public void saveOne(Personne p);
	public void deleteOne(Integer id);
}
