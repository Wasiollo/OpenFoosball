package service;

import dao.ScoringDao;
import model.Scoring;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoringService {

    @Autowired
    public ScoringDao scoringDao;

    public List<Scoring> findAll() {

        List<Scoring> scorings = (List<Scoring>) scoringDao.findAll();

        return scorings;
    }
}
