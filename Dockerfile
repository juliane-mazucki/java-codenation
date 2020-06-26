FROM node:5.2

RUN npm install bower -g

RUN npm cache clear

CMD [ “bash” ]