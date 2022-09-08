package se331.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se331.rest.dao.EventDao;
import se331.rest.entity.Event;
import se331.rest.entity.Organizer;

import java.util.List;

@Service
public class EventServiceImpl implements EventService{
    @Autowired
    EventDao eventDao;
    @Override
    public Integer getEventSize() {
        return eventDao.getEventSize();
    }

    @Override
    public List<Organizer> getEvents(Integer pageSize, Integer page) {
        return eventDao.getEvents(pageSize, page);
    }

    @Override
    public Organizer getEvent(Long id) {
        return eventDao.getEvent(id);
    }
}
