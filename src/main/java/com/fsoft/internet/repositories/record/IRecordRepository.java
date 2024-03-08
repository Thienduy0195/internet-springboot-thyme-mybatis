package com.fsoft.internet.repositories.record;

import com.fsoft.internet.entities.RecordId;
import com.fsoft.internet.entities.Records;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IRecordRepository extends JpaRepository<Records, RecordId> {


}
