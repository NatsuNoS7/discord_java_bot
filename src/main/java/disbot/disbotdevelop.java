package disbot;

import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;

import javax.security.auth.login.LoginException;

public class disbotdevelop
{
    public static JDA jda;

    public static void main(String[] args)
    {
        JDABuilder jb = new JDABuilder(AccountType.BOT);
        jb.setAutoReconnect(true);
        jb.setStatus(OnlineStatus.DO_NOT_DISTURB);
        jb.setToken("<@877924234645618738>");

        try
        {
            jda = jb.buildBlocking();
        }
        catch (LoginException e)
        {
            e.printStackTrace();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
