package ma.essalmi.chatbotrag.services;

import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.hilla.BrowserCallable;
import com.vaadin.hilla.crud.CrudRepositoryService;
import ma.essalmi.chatbotrag.Repository.PersonRepository;
import ma.essalmi.chatbotrag.entities.Person;
import org.springframework.stereotype.Service;

@Service
@BrowserCallable
@AnonymousAllowed
public class PersonService extends CrudRepositoryService<Person, Long, PersonRepository> {
}
