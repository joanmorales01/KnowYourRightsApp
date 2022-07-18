package com.jmora.knowyourrightsapp;

import android.widget.TextView;

import com.jmora.knowyourrightsapp.QuestionList;

import java.util.ArrayList;
import java.util.List;

public class QuestionBank {


    private static List<QuestionList> lawEnforcementQuestions() {
        final List<QuestionList> questionLists = new ArrayList<>();

        final QuestionList question1 = new QuestionList("Which amendment to the constitution is important to verbally invoke to “remain silent”?", "First amendment", "Third Amendment", "Fifth Amendment", "Sixth Amendment", "Fifth Amendment", "");
        final QuestionList question2 = new QuestionList("Police are allowed to:", "Lie to you or misinform you", "Force you to speak", "Order you to stop recording them", "First and Third option", "Lie to you or misinform you", "");
        final QuestionList question3 = new QuestionList("What is a myth about arrests?", "Police must read you the Miranda rights", "  You may be arrested without the word “arrest” ever being used ", "You will be taken to a police station, jail or other detention facility", "Anything you say can be used against you in court", "Police must read you the Miranda rights", "");
        final QuestionList question4 = new QuestionList("Which of the following is law enforcement never entitled to when you are arrested?", "Take your possessions and fingerprints", "Demand you to reveal your cell phone passcode", "Forcibly unlock your cell phone with Face/Touch ID", "All of the above", "Demand you to reveal your cell phone passcode", "");
        final QuestionList question5 = new QuestionList("What is a good rule to follow when stopped by police while driving?", "Consent to a search to prove innocence", "Keep hands on the wheel", "Answer every question", "Call for a family member to come", "Keep hands on the wheel", "");
        final QuestionList question6 = new QuestionList("In which circumstance are you required to provide police with your ID?", "When driving", "When you’ve been arrested", "When carrying a handgun", "All of the above", "All of the above", "");
        final QuestionList question7 = new QuestionList("What should you do if a police office issues you a ticket?", "Refuse to sign, you are not legally obligated", "Sign, because you may be arrested if you don’t","Refuse to sign, it is an admission of guilt ","First and Third option","Sign, because you may be arrested if you don’t","");
        final QuestionList question8 = new QuestionList("What are you required to provide before exercising your right to remain silent?", "Name, address, date of birth", "Access to your property", "Where you’re going/coming from", "None of the above","Name, address, date of birth","");
        final QuestionList question9 = new QuestionList("When are you legally able to record a police officer?", "At any time in public", "Only when being questioned or detained", "After being given consent from the officer", "All of the above","All of the above","");
        final QuestionList question10 = new QuestionList("Which of the following best describes a warrant?", "  A piece of legislation that allows the police department with access to all of your personal information and property", "A document issued by a judge that grants the police with unlimited access to any and all of your personal property", "A document signed by a judge giving the police permission to either arrest you or search your property", "A document signed by you confirming that you will allow the police to search your property under assistance","A document signed by a judge giving the police permission to either arrest you or search your property","");

        questionLists.add(question1);
        questionLists.add(question2);
        questionLists.add(question3);
        questionLists.add(question4);
        questionLists.add(question5);
        questionLists.add(question6);
        questionLists.add(question7);
        questionLists.add(question8);
        questionLists.add(question9);
        questionLists.add(question10);

        return questionLists;
    }


    private static List<QuestionList> ImmigrantsQuestions() {
        final List<QuestionList> questionLists = new ArrayList<>();

        final QuestionList question1 = new QuestionList("Which persons in the United States have constitutional rights?", "Citizens and permanent residents", "Anyone with a government issued visa", "Undocumented Immigrants", "All of the above", "All of the above", "");
        final QuestionList question2 = new QuestionList("Why must you never lie about your citizenship status to law enforcement?", "You can, anything outside of a court of law is not admissible", "It can lead to long-term consequences such as permanent ban to the country", "Only if it is not to immigration officials like ICE and Border Patrol", "Lying about citizenship status is second degree felony", "It can lead to long-term consequences such as permanent ban to the country", "");
        final QuestionList question3 = new QuestionList("If detained by ICE which is true?", "They must provide you with a free attorney", "You have the right to communicate with your consulate", "You must sign everything to prevent deportation", "All of the above", "You have the right to communicate with your consulate", "");
        final QuestionList question4 = new QuestionList("Which amendment to the constitution is important to verbally invoke to “remain silent”?", "Second amendment", "Third Amendment", "Fourth Amendment", "Fifth Amendment", "Fifth Amendment", "");
        final QuestionList question5 = new QuestionList("Do undocumented children legally have access to primary and secondary education?", "It depends on the state and their state laws", "Only if they are in the process of obtaining permanent residency", "All children regardless of immigration status have the right to K-12 education", "No, this is unlawful and can result in a court mandated warrant", "All children regardless of immigration status have the right to K-12 education", "");
        final QuestionList question6 = new QuestionList("Can an undocumented immigrant be a victim of a crime?", "Yes, and are entitled to protection", "No, there are currently no laws protecting undocumented immigrants from crimes", "Yes, but only if detained by immigration", "No, and any report can result in immediate deportation", "Yes, and are entitled to protection", "");
        final QuestionList question7 = new QuestionList("What is a sanctuary city?", "A city that limits its cooperation with federal immigration enforcement agents in order to protect low-priority immigrants from deportation", "A city that is within 100-miles of the border and is subject to different immigration proceedings", "A city near the US border where immigration officers such as Border patrol can be found", "An area of land held and governed by a federally recognized Native American tribal nation", "A city that limits its cooperation with federal immigration enforcement agents in order to protect low-priority immigrants from deportation", "");
        final QuestionList question8 = new QuestionList("Undocumented students are eligible for what type of financial aid?", "FAFSA: Free Application for Federal Student Aid", "Federal Grants such as the Pell Grant", "Depending on the state, State financial aid", "None of the above", "Depending on the state, State financial aid", "");
        final QuestionList question9 = new QuestionList("Where can US Customs and Border Protection be found?", "At airports", "At state checkpoints", "International ports of entry", "All of the above", "All of the above", "");
        final QuestionList question10 = new QuestionList("What is the Diversity Immigrant Visa Program?", "A lottery program for receiving a United States Permanent Resident Card for individuals who are from countries with low rates of immigration", "A visa granted to skilled whose jobs provide extraordinary abilities to the science, art, education, business, or athletics", "A program created for members of religious denominations coming to the U.S. to work for a nonprofit religious organization", "A visa granted to undocumented immigrants currently residing in the United States on the basis of race, age, and gender", "A lottery program for receiving a United States Permanent Resident Card for individuals who are from countries with low rates of immigration", "");

        questionLists.add(question1);
        questionLists.add(question2);
        questionLists.add(question3);
        questionLists.add(question4);
        questionLists.add(question5);
        questionLists.add(question6);
        questionLists.add(question7);
        questionLists.add(question8);
        questionLists.add(question9);
        questionLists.add(question10);

        return questionLists;
    }


    private static List<QuestionList> MedicalQuestions() {
        final List<QuestionList> questionLists = new ArrayList<>();

        final QuestionList question1 = new QuestionList("What is HIPAA?", "A law that provides baseline privacy and security standards for medical information", "A government program designed to reduce the cost of health insurance coverage for people who qualify for it", "A civil rights law that prohibits discrimination against individuals with disabilities in all areas of public life", "A program offered by most health-care facilities that provide low-income patients with low cost or free services", "A law that provides baseline privacy and security standards for medical information", "");
        final QuestionList question2 = new QuestionList("Who is eligible for Medicaid?", "Adults with low income", "Pregnant women", "People with disabilities", "All of the above", "All of the above", "");
        final QuestionList question3 = new QuestionList("Which is not a HIPAA violation?", "A medical employee looking at health records without authorization", "Your employer requiring you to be vaccinated and show proof", "Nurses talking about a patient in a public area", "A doctor’s laptop being stolen that contained personal health information", "Your employer requiring you to be vaccinated and show proof", "");
        final QuestionList question4 = new QuestionList("What is a patient bill of rights?", "A document that provides patients with information on how they can reasonably expect to be treated", "An amendment to the US constitution that dictates what services must be provided in all health-related facilities", "A health reform law that provides low-income Americans with affordable health insurance", "None of the above", "A document that provides patients with information on how they can reasonably expect to be treated", "");
        final QuestionList question5 = new QuestionList("Informed consent is not required when:", "The procedure is simple and common", "There is a life-threatening emergency", "The patient’s mental status prevents a reasonable informed consent", "All of the above", "All of the above", "");
        final QuestionList question6 = new QuestionList("A debt collector can:", "Sue you for payment", "Call you whenever they want", "Show up to your workplace", "Threaten to have you arrested", "Sue you for payment", "");
        final QuestionList question7 = new QuestionList("What can you ask for to lower a hospital bill?", "Ask for financial assistance programs", "Ask for an itemized bill to ensure correctness", "Review your insurance coverage", "All of the above", "All of the above", "");
        final QuestionList question8 = new QuestionList("Patients have a right to be _____ if they are unable to pay for services provided", "Detained", "Discharged", "Mandated to create an installment plan", "Held for questioning", "Discharged", "");
        final QuestionList question9 = new QuestionList("Non-profit hospitals are required to:", "Offer Financial Assistance plans", "Ensure patients are vaccinated if not", "Provide an interpreter for patients with limited English", "First and Third option", "First and Third option", "");
        final QuestionList question10 = new QuestionList("Patients do not have a right to:", "Know the names of his caregivers", "Choose doctors", "Access medical records", "None of the above", "None of the above", "");

        questionLists.add(question1);
        questionLists.add(question2);
        questionLists.add(question3);
        questionLists.add(question4);
        questionLists.add(question5);
        questionLists.add(question6);
        questionLists.add(question7);
        questionLists.add(question8);
        questionLists.add(question9);
        questionLists.add(question10);

        return questionLists;
    }


    private static List<QuestionList> WorkersQuestions() {
        final List<QuestionList> questionLists = new ArrayList<>();

        final QuestionList question1 = new QuestionList("What is COBRA?", "A federal law that lets employees continue their health coverage for a period of time after they leave their job", "An organized group of workers who unite to make decisions about conditions affecting their work", "An employee benefit that provides job-protected leave from employment to care for a child following its birth or adoption", "None of the above", "A federal law that lets employees continue their health coverage for a period of time after they leave their job", "");
        final QuestionList question2 = new QuestionList("What is a purpose of a workplace creating a union?", "Ensure fair wages", "Create a safer workplace", "Protect workers from unjust situations", "All of the above", "All of the above", "");
        final QuestionList question3 = new QuestionList("Federal overtime law states that:", "Employees must be paid 1.5 times their normal wage for every hour worked after 40 hours worked per week", "Employees must be paid 2.0 times their normal wage for every hour worked after 40 hours worked per week", "Employees cannot work for more than 60 hours a week or 7 consecutive days", "Employees cannot be subject to termination for accumulating more hours than scheduled due to working overtime", "Employees must be paid 1.5 times their normal wage for every hour worked after 40 hours worked per week", "");
        final QuestionList question4 = new QuestionList("Can an employer ask if you have any health problems?", "No, this is a violation of the American with Disabilities act", "Yes, but only if applying to a healthcare related position", "Yes, only if the questions are related with the ability to perform related activities to function job duties", "No, this is a HIPAA violation", "Yes, only if the questions are related with the ability to perform related activities to function job duties", "");
        final QuestionList question5 = new QuestionList("What is OSHA?", "A federal government agency to ensure safe and healthful working conditions for workers", "A government program that provides assistant to workers who have been discriminated", "A federal law that restricts the powers of unions over a business", "The government organization that is in charge of providing workers with training to large machinery", "A federal government agency to ensure safe and healthful working conditions for workers", "");
        final QuestionList question6 = new QuestionList("Discussions about wages with other employees:", "Is determined by the company’s employment contract", "Is a protected right for all workers to use", "Can lead to termination due to disruption of workplace", "Is not an important topic since positions are granted based on experience", "Is a protected right for all workers to use", "");
        final QuestionList question7 = new QuestionList("An employee who reports a violation of workplace safety is legally protected from:", "Being fired or laid off", "Having hours reduced", "Being disciplined", "All of the above", "All of the above", "");
        final QuestionList question8 = new QuestionList("Firing someone based on their sexual orientation:", "Is illegal for government jobs, legal for private businesses", "Is legal depending on the state", "Is a violation of federal law and is discrimination everywhere", "There are currently no laws that protects sexual orientation", "Is a violation of federal law and is discrimination everywhere", "");
        final QuestionList question9 = new QuestionList("Can an employer hire a family member?", "Yes, as long as strict policies are enforced to prevent nepotism", "No, this is an act of nepotism and is prohibited", "Yes, non-government employers are exempt from federal regulations", "Only if a non-related person with power agrees it is not a violation", "Yes, as long as strict policies are enforced to prevent nepotism", "");
        final QuestionList question10 = new QuestionList("Quitting instead of being terminated can result in losing:", "Severance", "Unemployment compensation", "Unemployment compensation", "First and Second option", "First and Second option", "");


        questionLists.add(question1);
        questionLists.add(question2);
        questionLists.add(question3);
        questionLists.add(question4);
        questionLists.add(question5);
        questionLists.add(question6);
        questionLists.add(question7);
        questionLists.add(question8);
        questionLists.add(question9);
        questionLists.add(question10);

        return questionLists;
    }

    public static List<QuestionList> getQuestions(String selectedTopicName) {

        switch (selectedTopicName) {
            case "Law Enforcement":
                return lawEnforcementQuestions();
            case "Immigrants":
                return ImmigrantsQuestions();
            case "Medical":
                return MedicalQuestions();
        }
        return WorkersQuestions();
    }
}
