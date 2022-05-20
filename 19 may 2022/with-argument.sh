

set_up(){
	rm -rf coffeee-frontend coffeee-api coffee-feeds recruiter-service
    git clone https://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@github.com/Coffeee-io/coffeee-frontend.git && \
    git clone https://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@github.com/Coffeee-io/coffeee-api.git && \
    git clone https://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@github.com/Coffeee-io/coffee-feeds.git && \
    git clone https://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@github.com/Coffeee-io/recruiter-service.git
}
build_recuter_service() {
    cd recruiter-service/
    exec bash 
    git branch
    git add .
    git reset --hard
    git pull origin #$recutiter_service_branch
    sh startup.sh #$recutiter_service_environment  
    cd ..
    exec bash
}
build_frontend_service() {
    cd coffeee-frontend/
    exec bash
    git branch
    git add .
    git reset --hard
    git pull origin staging 
    sh startup.sh
    cd ..
    exec bash
}


case $1 in 
"kill")kill $(ps aux | grep 'node' | awk '{print $2}')
;;
"path") cd /home/vishal1201/Deployment/
exec bash
;;
"setup")set_up 
;;
"recruiter")build_recuter_service
;;
"frontent")build_frontend_service
;;
*) 
  echo "Wrong operation"
    ;;
esac


