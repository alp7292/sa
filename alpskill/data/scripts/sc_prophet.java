package data.scripts;


import com.fs.starfarer.api.campaign.CampaignFleetAPI;
import second_in_command.SCData;
import second_in_command.specs.SCAptitudeSection;
import second_in_command.specs.SCBaseAptitudePlugin;

import java.util.Objects;

public class sc_prophet extends SCBaseAptitudePlugin {
    @Override
    public String getOriginSkillId() {
        return "prophet_tt1";
    }

    @Override
    public void createSections() {
        SCAptitudeSection section1 = new SCAptitudeSection(true, 0, "technology1");
        section1.addSkill("prophet_tt2");
        section1.addSkill("prophet_tt3");
        addSection(section1);


    }

    @Override
    public Float getNPCFleetSpawnWeight(SCData data, CampaignFleetAPI fleet) {
        return 0f;
    }
}
