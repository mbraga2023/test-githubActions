package br.com.dbccompany.factory.data;

import br.com.dbccompany.dto.NewsletterDto;
import br.com.dbccompany.util.DataFakerGeneretor;

public class NewsletterData {

    DataFakerGeneretor dataFakerGeneretor = new DataFakerGeneretor();

    public NewsletterDto newsletterEmailValido(){
        NewsletterDto newsletterDto = new NewsletterDto();
        newsletterDto.setEmail(dataFakerGeneretor.emailFaker());
        return newsletterDto;
    }

    public NewsletterDto newsletterEmailInvalido(){
        NewsletterDto newsletterDto = new NewsletterDto();
        newsletterDto.setEmail("XX.com");
        return newsletterDto;
    }

    public NewsletterDto newsletterEmailEmBranco(){
        NewsletterDto newsletterDto = new NewsletterDto();
        newsletterDto.setEmail("");
        return newsletterDto;
    }

    public NewsletterDto newsletterEmailJaCadastrado(){
        NewsletterDto newsletterDto = new NewsletterDto();
        newsletterDto.setEmail("jacadastrado@gmail.com");
        return newsletterDto;
    }
}
