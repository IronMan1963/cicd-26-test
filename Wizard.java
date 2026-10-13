package univaq.dungeonquest.datamodel;

import java.util.ArrayList;
import java.util.List;

/**
 * class Wizard is a subclass of Hero representing a wizard character in the game.
 * the wizard is the most particular hero in the game. 
 * this type of hero has mana and an extra inventory for spells. 
 * 
 * attributes:
 * - wizardMana: Integer, current mana of the wizard.
 * - wizardMaxMana: Integer, maximum mana of the wizard, depends on the wizard's level.
 * - wizardSpellInventory: {@code List<Spell>}, list of spells that the wizard has learned, he can learn new spells by the merchant based on his level.
 * - wizardAttackPhrase: {@code List<String>}, list of phrases that the wizard can say when he attacks.
 * - wizardDescription: String, description of the wizard character.
 * 
 * @author MatteoTessari2005
 * @author AnnaMad000 //add comments
 * @version 2.1
 * @see univaq.dungeonquest.datamodel.Hero
 * @see univaq.dungeonquest.datamodel.Spell
 * @see univaq.dungeonquest.service.FightService
 * @see univaq.dungeonquest.service.MoveService
 * @see univaq.dungeonquest.service.SkillService
 */
public class Wizard extends Hero{
    private Integer wizardMana;
    private Integer wizardMaxMana;
    private List<Spell> wizardSpellInventory;
    private List<String> wizardAttackPhrase;
    private String wizardDescription;

    private static final long serialVersionUID = 1L;

    /** 
     * Constructor for the Wizard class.
     *
     * @param wizardMana Integer, current mana of the wizard at the start (equal to max mana)
     * @param wizardMaxMana Integer, maximum mana of the wizard
     * @param wizardSpellInventory {@code List<Spell>}, list of spells that the wizard has learned
     * @param wizardAttackPhrase {@code List<String>}, list of phrases that the wizard can say when he attacks
     * @param wizardDescription String, description of the wizard character
     * @param entityName Name of the wizard (passed to super)
     * @param entityStatistic Statistic of the wizard (passed to super)
     * @param currentRoom Current room of the wizard (passed to super)
     * @param isAlive Boolean value indicating if the wizard is alive (passed to super)
     * @param statusEffect Status effect applied to the wizard (passed to super)
     * @param statusDuration Duration of the status effect (passed to super)
     * @param level Level of the wizard (passed to super)
     * @param exp Experience points of the wizard (passed to super)
     * @param heroInventory Inventory of the wizard (passed to super)
     * @param heroCoin Coins owned by the wizard (passed to super)
     * @param heroSkill Skill of the wizard (passed to super)
     * @param heroMission Mission assigned to the hero at the start of the game (passed to super)
     * @param heroGame Game instance the hero belongs to (passed to super)
     */
    public Wizard(Integer wizardMana, Integer wizardMaxMana, List<Spell> wizardSpellInventory, List<String> wizardAttackPhrase, String wizardDescription, String entityName, Statistic entityStatistic, Room currentRoom, Boolean isAlive, StatusEffect statusEffect, Integer statusDuration, Integer level, Integer exp, List<Item> heroInventory, Integer heroCoin, Skill heroSkill, Mission heroMission, Game heroGame) {
        super(entityName, entityStatistic, currentRoom, isAlive, statusEffect, statusDuration, level, exp, heroInventory, heroCoin, heroSkill, heroMission,  heroGame, new ArrayList<>());
        this.wizardMana = wizardMana;
        this.wizardMaxMana = wizardMaxMana;
        this.wizardSpellInventory = wizardSpellInventory;
        this.wizardAttackPhrase = wizardAttackPhrase;
        this.wizardDescription = wizardDescription; 
    }

    /**
     * Getter for wizardManaù
     * 
     * @return wizardMana
     */
    public Integer getWizardMana() {
        return wizardMana; 
    }

    /**
     * Setter for wizardMana
     * 
     * @param wizardMana
     */
    public void setWizardMana(Integer wizardMana) {
        this.wizardMana = wizardMana; 
    }

    /**
     * Getter for wizardMaxMana
     * 
     * @return wizardMaxMana
     */
    public Integer getWizardMaxMana() {
        return wizardMaxMana; 
    }

    /**
     * Setter for wizardMaxMana
     * 
     * @param wizardMaxMana
     */
    public void setWizardMaxMana(Integer wizardMaxMana) {
        this.wizardMaxMana = wizardMaxMana; 
    }

    /**
     * Getter for wizardSpellInventory
     * 
     * @return wizardSpellInventory
     */
    public List<Spell> getWizardSpellInventory() {
        return wizardSpellInventory; 
    }

    /**
     * Setter for wizardSpellInventory
     * 
     * @param wizardSpellInventory
     */
    public void setWizardSpellInventory(List<Spell> wizardSpellInventory) {
        this.wizardSpellInventory = wizardSpellInventory; 
    }

    /**
     * Getter for wizardAttackPhrase
     * 
     * @return wizardAttackPhrase
     */
    public List<String> getWizardAttackPhrase() {
        return wizardAttackPhrase; 
    }

    /**
     * Setter for wizardAttackPhrase
     * 
     * @param wizardAttackPhrase
     */
    public void setWizardAttackPhrase(List<String> wizardAttackPhrase) {
        this.wizardAttackPhrase = wizardAttackPhrase; 
    }

    /**
     * Getter for wizardDescription
     * 
     * @return wizardDescription
     */
    public String getWizardDescription() {
        return wizardDescription; 
    }

    /**
     * Setter for wizardDescription
     * 
     * @param wizardDescription
     */
    public void setWizardDescription(String wizardDescription) {
        this.wizardDescription = wizardDescription; 
    }
}
