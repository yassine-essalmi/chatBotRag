import {Button, TextField} from "@vaadin/react-components";
import {useState} from "react";
import {ChatAiService} from "Frontend/generated/endpoints";
import Markdown from "react-markdown";

export default function chat() {

    const [question, setQuestion] = useState('')
    const [answer, setAnswer] = useState('')

    async function sendQuestion() {
        ChatAiService.ragChat(question).then(resp => setAnswer(resp))
    }

    return (
        <div className="p-m">
            <h1>Chat Page</h1>
            <div>
                <TextField
                    style={{width:'80%', marginRight:'1rem'}}
                    onChange={event => setQuestion(event.target.value)}

                />
                <Button
                    theme="primary"
                    onClick={sendQuestion} >Send</Button>
                <div>
                    <Markdown>
                        {answer}
                    </Markdown>
                </div>
            </div>
        </div>
    );
}