package service;

import java.util.List;

import dao.GuitarSearchDao;
import entity.Guitar;

public interface GuitarSearchService {
	public void setGuitarSearchDao(GuitarSearchDao guitarSearchDao);
	//��������ѯ��Ӧ����
	public List<Guitar> getAllGuitars();
}
