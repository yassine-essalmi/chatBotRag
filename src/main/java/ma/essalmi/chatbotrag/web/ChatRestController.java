package ma.essalmi.chatbotrag.web;

import lombok.RequiredArgsConstructor;
import ma.essalmi.chatbotrag.services.ChatAiService;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.awt.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/chat")
public class ChatRestController {

    private final ChatAiService chatAiService;

    @GetMapping(value = "/ask", produces = MediaType.TEXT_PLAIN_VALUE)
    public String ask(String question) {
        return chatAiService.ragChat(question);
    }

}
