package fr.reivon.formation.spring13;

import org.springframework.batch.item.ItemProcessor;

import java.util.Date;

public class CustomItemProcessor implements ItemProcessor<ReportDto, ReportDto> {

    /**
     * Gestion des règles métiers
     */
    public ReportDto process(ReportDto item) throws Exception {
        System.out.println("Processing..." + item);

        // Tous les items après la date du jour sont ignorés
        if(item.getDate().after(new Date())) {
            return null;
        }

        return item;
    }

}
