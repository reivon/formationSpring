package fr.reivon.formation.spring13;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

public class ReportFieldSetMapper implements FieldSetMapper<ReportDto> {

    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public ReportDto mapFieldSet(FieldSet fieldSet) throws BindException {
        ReportDto reportDto = new ReportDto();
        reportDto.setId(fieldSet.readInt(0));
        reportDto.setSales(fieldSet.readBigDecimal(1));
        reportDto.setQty(fieldSet.readInt(2));
        reportDto.setStaffName(fieldSet.readString(3));

        //default format yyyy-MM-dd
        //fieldSet.readDate(4);
        String date = fieldSet.readString(4);
        try {
            reportDto.setDate(dateFormat.parse(date));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return reportDto;
    }

}