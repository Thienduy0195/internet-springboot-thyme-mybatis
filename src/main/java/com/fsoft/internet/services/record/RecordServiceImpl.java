package com.fsoft.internet.services.record;

import com.fsoft.internet.mappers.RecordMapper;
import com.fsoft.internet.models.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Qualifier("main")
public class RecordServiceImpl implements IRecordService {

    private RecordMapper recordMapper;

    @Autowired
    public RecordServiceImpl(RecordMapper recordMapper) {
        this.recordMapper = recordMapper;
    }

    @Override
    public void createOrUpdate(Record record) {
        recordMapper.insert(record);
    }

    @Override
    public List<Record> getAllByCustomerId(String id) {
        return null;
    }

    @Override
    public int getNoOfRecord() {
        return 0;
    }

    @Override
    public List<Record> getRecordForCurrentPage(int start, int RecordPerPage) {
        return null;
    }

    @Override
    public List<Record> search(String customerId, String computerId, int i,
                               int RecordPerPage) {
        return null;
    }

    @Override
    public List<Record> search(String customerId, String computerId) {
        // TODO Auto-generated method stub
        return null;
    }

}
