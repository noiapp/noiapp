This site is obsolete! We moved on implementng native apps using DP3T sources.

Please follow us on [this site](https://github.com/noiapp/website).

I leave the rest for reference but DO NOT try to run this code please.  We are no more working on it


# Noi App

This project aims to create a contact tracing mobile based on the [DP-3T](https://github.com/DP-3T) standard, specifically aimed to the italian population.

This standard is designed to be privacy respectful and does not share informations, except anonymized data for volontary disclosure by people who find themself infected. Those data can then be checked by the app to verify if you were in contact with someone infected.

Furthermore this standard appear to be compatible with the upcoming API of Apple/Google for contact tracing.

The application in the current shape will be a React Native application including as modules the DP-3T sdk, with a backend written in Java with Spring. The technology stack may change over the time.

## Want to help?

If you want collaborate, 

- subscribe to the [this](https://groups.google.com/forum/#!forum/noiapp) Google Group for normative decisions.
- join us on Slack with this [invite link](https://join.slack.com/t/noiapp/shared_invite/zt-dzdakd34-KvCn3HMlebqTH4ewlGamhg) 

Note the invite link expires in 30 days so if it is no more valid please [let me know](http://linkedin.com/in/msciab) so I can update it.

## Background

Disclaimer: if you find any incorrect information please file an issue to let us provide correct informations.

An "official" italian app is supposed to be being developed, although the status is unknown. What is known is that:

- a private company in Italy was selected to develop the application.
- we explicitly asked about the release of the source code but no answer has been (yet) given.
- we was told informally that the source code will be released, but nothing offical
- even if the code will be released, it is to be seen if what is released is complete enough and documented enough that can be reviewed by the community
- this company is member of the  [PEPP-PT](https://github.com/pepp-pt/pepp-pt-documentation) organization and it has been disclosed the app will use the PPPT-DT standard.
- the PEPP-PT organization is basically an invite-only organization. Nothing is known how it works internally.  At the moment no public source code has been yet released, although they declare the code to be Mozilla licensed.
- The standard PPPT-DP also is designed to include a centralized control of the contact informations.
- In the last few days the relationship among [PEPP-DP and DP-3T](https://twitter.com/mikarv/status/1250850682904760320?s=20) went awry, as any reference to DP-3T was removed from PEPP-DP.

## Rationale

For those reasons whatever is the outcome of the development of the 'official' app, we believe it is required another app with  those goals:

- developed as an opensource project from the ground up 
- community oriented, without any relationship with private organizations
- using the "alternative" standard D3PT (decentralized) as opposed to the PEPP-DP (centralised) standard
- able to be integrated with the upcoming APIs from Apple and Google.

This is the main repository of this app.

