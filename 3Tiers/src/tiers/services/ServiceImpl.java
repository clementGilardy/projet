package tiers.services;

import java.util.Collection;

import tiers.DAO.IDao;
import tiers.bean.Personne;

public class ServiceImpl implements IService {
	private IDao dao;
	
	public IDao getDao() {
		return dao;
	}

	public void setDao(IDao dao) {
		this.dao = dao;
	}

	@Override
	public Collection<Personne> getAll() {

		return dao.getAll();
	}

	@Override
	public Personne getOne(Integer id) {
		return dao.getOne(id);
	}

	@Override
	public void saveOne(Personne p) {
		dao.saveOne(p);
		
	}

	@Override
	public void deleteOne(Integer id) {
		dao.deleteOne(id);
		
	}

}
