package TeamBot;

import net.minidev.json.JSONObject;
import org.pircbotx.hooks.ListenerAdapter;
import org.pircbotx.hooks.types.GenericMessageEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BotListener extends ListenerAdapter {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(TeamBot.class);
    private QueueSender queueSender;
    
    public void setQueueSender(QueueSender queueSender) {
        this.queueSender = queueSender;
    }
    
    @Override
    public void onGenericMessage(GenericMessageEvent event) {
        if (event.getMessage().startsWith("?coffee")) {
            event.respond("Coffee coming up for " + event.getUser().getNick());
            
            JSONObject json = new JSONObject();
            json.put("item", "coffee");
            json.put("user", event.getUser().getNick());
            
            queueSender.sendMessage(json.toString());
            LOGGER.info(String.format("Coffee has been ordered for %s.", event.getUser().getNick()));
        }    
    }
}
