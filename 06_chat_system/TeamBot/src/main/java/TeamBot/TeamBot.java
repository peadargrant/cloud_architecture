package TeamBot;

import org.pircbotx.Configuration;
import org.pircbotx.PircBotX;
import org.pircbotx.hooks.ListenerAdapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TeamBot extends ListenerAdapter {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(TeamBot.class);

    public static void main(String[] args) throws Exception {
        System.out.println("TeamBot starting up");
        //Configure what we want our bot to do
        Configuration configuration = new Configuration.Builder()
                .setAutoNickChange(true)
                .setName("TeamBot") //Set the nick of the bot. CHANGE IN YOUR CODE
                .addServer("127.0.0.1") //Join the freenode network
                .addAutoJoinChannel("#general") //Join the official #pircbotx channel
                .addListener(new BotListener()) //Add our listener that will be called on Events
                .buildConfiguration();

        //Create our bot with the configuration
        PircBotX bot = new PircBotX(configuration);

        //Connect to the server
        bot.startBot();
        
    }
}
