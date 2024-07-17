import {AutoCrud} from "@vaadin/hilla-react-crud";
import {PersonService} from "Frontend/generated/endpoints";
import PersonModel from "Frontend/generated/ma/essalmi/chatbotrag/entities/PersonModel";

export default function Person() {
    return (
        <div>
            <AutoCrud service={PersonService} model={PersonModel}></AutoCrud>
        </div>
    );
}